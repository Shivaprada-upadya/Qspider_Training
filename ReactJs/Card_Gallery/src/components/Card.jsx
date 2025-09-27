
import jeep from "../../public/jeep.jpg"
const Card=(props)=>{
let {name,source}= props

    return(
<div className="card bg-info" style={{width:"20rem"}}>

        <div className="card-header">
            <img className="rounded" style={{width:"100%"}} src={source}  alt="jeep"/>
        </div>

        <div className="card-body text-center">
        <h1>{name}</h1>
        </div>
</div>
    ) 
}

export default Card