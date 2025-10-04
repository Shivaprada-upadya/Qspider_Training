//Inbuilt function
let str = (str)=>{
    let rev =  str.split('').reverse().join('')
    console.log(rev)
    if(str == rev)
        return 'palindrome'
    else    
        return 'not a palidrome'
}

// two pointer technique
let method = (str)=>{
   let left=0 ,right =str.length
   while(left<right)
   {
    if(str.charAt(left)==str.charAt(right))
    {
        left++;
        right--;
    }
    else{
        return false;
    }
   }
   return true;
}



let res=str('madam')
console.log(res)
let ans=method('shiva')
console.log(ans)
