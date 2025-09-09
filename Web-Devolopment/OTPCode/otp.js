let button = document.getElementById('captcha-btn')
let span= document.querySelector('span')
button.addEventListener('click', () => {
    let str="ksbkfjbewkjerkgnwlkgneklgn"
    let captcha=''
    for(let i=1;i<=4;i++)
    {
        let num=Math.round(Math.random() *str.length())
        captcha+=str[num]
    }
    span.innerText=captcha
})