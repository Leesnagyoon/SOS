const size = document.getElementById("size");
const content =document.getElementById("content");
const apply = document.getElementById("apply");
const color = document.getElementById("color");
const result = document.getElementById("result");

document.getElementById("apply").addEventListener("click",()=>{
    content.style.fontSize = size.value +"px";
    content.style.color = color.value;
});
document.getElementById("registration").addEventListener("click",()=>{
    const child = document.createElement("div")
    child.innerHTML = content.value
    child.setAttribute("style",content.getAttribute("style"));

    result.append(child)
});