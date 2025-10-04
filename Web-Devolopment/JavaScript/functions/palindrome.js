let str = (str)=>{
    let rev =  str.split('').reverse().join('')
    console.log(rev)
    if(str === rev)
        return 'palindrome'
    else    
        return 'not a palidrome'
}
let res=str('shivprada')
console.log(res)