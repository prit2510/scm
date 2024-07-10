console.log("jay swaminarayana");

let currentTheme = getTheme();
changeTheme();

function changeTheme() {
    document.querySelector("html").classList.add(currentTheme);
    document.querySelector(".theme_change_button").addEventListener("click", (event) => {
        console.log("event");
        let oldTheme = currentTheme;
        if (currentTheme === "light") {
            document.querySelector(".theme_change_button").innerHTML = `<i class="fa-solid fa-circle-half-stroke"></i> Light`;
            currentTheme = "dark";
        } else {
            document.querySelector(".theme_change_button").innerHTML = `<i class="fa-solid fa-circle-half-stroke"></i> Dark`;
            currentTheme = "light";
        }
        document.querySelector("html").classList.remove("light", "dark");
        document.querySelector("html").classList.add(currentTheme);
        setTheme(currentTheme);
        
    });
}

function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "Light";
}
