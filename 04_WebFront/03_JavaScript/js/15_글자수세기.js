// document.getElementById("content").addEventListener("keyup",()=>{
//     const count = document.getElementById("content").value.length;

//     document.getElementById("count").innerHTML = count

//     if(count>100){
//         document.getElementById("count").classList.add("error")
//     }else{document.getElementById("count").classList.remove("error")}
// });

document.getElementById("content").addEventListener("input",()=>{
                                /*input 이벤트  */
                                //input , textarea 등 입력 가능한
                                //요소에 값이 입력되면 인식
    const count = document.getElementById("content").value.length;

    document.getElementById("count").innerHTML = count

    if(count>100){
        document.getElementById("count").classList.add("error")
    }else{document.getElementById("count").classList.remove("error")}

    // 요소.classList.toggle('클래스명')
    // -요소에 클래스가 없으면 추가(true반환)
    // -요소에 클래스가 있으면 제거(false반환)
});