import {data} from "../data"
console.log(data)
const Practice=()=>{
    let [a,b,c,d] = data
return (
    <ol>    
        {/* {data.map(fruit =><li>{fruit}</li>)} */}

        {/* {data.map((item)=>{
            return <li>{item}</li>
        })} */}
    </ol>
)
}

export default Practice

// {data.map((item)=>
// {
//     <li>{item}</li>
// })}