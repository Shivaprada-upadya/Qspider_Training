import React,{useState} from "react";
const Form =()=>{

        let [state, setState]= useState("")

        let handleChange=(e)=>{
            setState(e.target.value)
        }

    return(
        <>
        <form action="">
            <input 
            
            className="bg-info p-2 m-2 rounded"
            type="text"
            placeholder="Enter Name"
            name="name"
            value={state}
            onChange={handleChange}            
            
            />
            <button className="btn btn-success">
                Submit
            </button>
            <p>Entered Data: {state}</p>

            
        </form>

        </>
    );
};
export default Form