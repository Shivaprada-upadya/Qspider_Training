import React,{useState} from "react";
const Form =()=>{

        let [state, setState]= useState("")
        let [newState, setNewState]= useState("")

        let handleChange=(e)=>{
            setState(e.target.value)
        }

        let handleSubmit=(e)=>{
            e.preventDefault()
            setNewState(state)
        }

    return(
        <>
        <form onSubmit={handleSubmit}>
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

            <p>Submitted Data: {newState}</p>
            
        </form>

        </>
    );
};
export default Form