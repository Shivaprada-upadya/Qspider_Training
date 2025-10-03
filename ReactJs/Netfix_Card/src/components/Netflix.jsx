import data from '../data.json'
import NetflixCard from './NetflixCard'

const Netflix=()=>{
    
    return(
        <>
        <div className="d-flex justify-content" >
        {
            data.map((elem)=>{
                return(
                    <NetflixCard data={elem}/>
                )

            })
        }
        
        </div>
        </>
    )
}


export default Netflix