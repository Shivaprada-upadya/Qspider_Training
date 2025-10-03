
const NetflixCard=(props)=>
    {

        let{name,id,img_url,rating,description,cast,genre,watch_url} = props.data
        console.log(props.data);

    return(
        <>
            <div className="card bg-info" style={{}}>
                <div className="card-header">
                <img src={img_url} style={{width:"300px", height:"400px"}}/>
                </div>
                <div className="card-body">
                <p>Name: {name}</p>
                <p>Rating: {rating}</p>
                <p>Summery: {description}</p>
                <p>Genre: {genre}</p>
                <p>Cast: {cast}</p>
                </div>
                <div className="card-footer " >
                <a href={watch_url}  > <button style={rating>8.5?{background:"orange"}:{background:"green"}}>Watch Now</button></a>
                </div>
            </div>

        </>
    )
}

export default NetflixCard