document.getElementById("createBtn").addEventListener("click",()=>{
    
    const arr = [];
    
    const list = document.getElementById("container").children
    

    while(arr.length<6){ //arr에 저장된 값이 6개 미만인 경우 반복
        
    const random = Math.floor(Math.random()*45+1); // 난수 생성
        
    if(arr.indexOf(random) == -1){
    arr.push(random); // 배열 마지막 요소로 추가
    }
}
    arr.sort((a,b) => a -b);

    
    for(let i =0; i<list.length;i++){
        list[i].innerHTML = arr[i];

    }


});