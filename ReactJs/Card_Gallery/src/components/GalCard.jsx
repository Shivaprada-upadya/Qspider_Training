const GalCard=(props)=>{
    let {title,description,logo}=props.elem ///nestes object 

    return(
        <div className='card text-center bg-secondary text-white' style={{width:"20rem"}}>
            <div className="card-header">
                <img src={logo} alt="" style={{height:"200px",width:"100%"}}/>
            </div>    
            <div className="card-body">
                        {description}
            </div>
            <div className="card-footer">
                        <h3>{title}</h3>
            </div>

        </div>
        
                
    )
}

export default GalCard