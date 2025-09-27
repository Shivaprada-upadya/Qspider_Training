import { gallery_data } from "../data";
import React from 'react'
import GalCard from "./GalCard";
const Gallery=()=>{
    return(
        <div className="d-flex justify-content-around mt-5">
        {
           gallery_data.map(elem =>{
            //let {title,description,logo} =elem
            return (
                <GalCard elem={elem} />
            )


           })
        
        }
        </div>    
    )
}


export default Gallery