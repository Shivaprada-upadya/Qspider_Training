// count=1
function fun1(callback)
{
    setTimeout(()=>{
        console.log("task1")
        callback()
    },2000)
    //console.log(count++)

}

function fun2(callback)
{
    setTimeout(()=>{
       // console.log(count++)
        console.log("task2")
        callback()
    },6000)
    
}

function fun3()
{
    setTimeout(()=>{
        console.log("task3")
    },10000)
}





fun1(()=>{
    fun2(()=>{
        fun3()
    })
})

