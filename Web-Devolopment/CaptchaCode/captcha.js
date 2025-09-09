let button = document.getElementById('captcha-btn')
let span= document.querySelector('span')
//let form=document.querySelector('form')
//let msg=document.querySelector('#msg')
let myCaptcha;
button.addEventListener('click', () => {
    let str="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*()"
    let captcha=''
    for(let i=1;i<=4;i++)
    {
        let num=Math.round(Math.random() *str.length())
        captcha+=str[num]
    }
    span.innerText=captcha
    myCaptcha=captcha
})

// validation

let form=document.querySelector('form')
let p=document.getElementById('msg')
form.addEventListener('submit', (event) =>{
    event.preventDefault();
    let user_input=event.target[0].value
    if(user_input== myCaptcha)
    {
        p.innerText='Valid Captcha'
        p.style.color='green'
    }
    else
    {    
        p.innerText='Invalid Captcha'
        p.style.color='red'
    }
})











// let 
// function generateNumber()
// {
//     let num =Math.round(Math.random()*10000)
//     if(num>999 && num<=9999)
//     {
//         span.innerText=num
//     }
//     else{
//         generateNumber()
//     }
// }

// button.addEventListener('click', () =>{
//     generateNumber()
// })