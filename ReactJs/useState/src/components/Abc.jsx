import React,{useState} from 'react'


const Abc=()=>{
        let [fruits,setFruits]=useState([])
        let inp;

    let addFruit=()=>{
        setFruits((preVal)=>([
            ...preVal,
            inp
        ]))
    }

    let handleChange =(event)=>{
        inp = event.target.value
    }

    return(
        <div>
        <input type="text" className='form-control' onChange={handleChange}/> 
        <button className='btn btn-outline-success' onClick={addFruit}>Add Fruit</button>
        {
            fruits.map((fruit,index)=>{
                return(
                    <h1>{index+1}. {fruit}</h1>
                )
            })
        }
        </div>
    )
}

export default Abc