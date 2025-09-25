

const BcaStudents=(porps)=>{

let arr=porps.bcaStud

return(
    <>
    {
        arr.map((elem)=>{

            let {fname,age,degree}=elem;
            return(
                <>


                <div>{fname},{age},{degree}</div>
                </>
            )
        }

        )


    }
    
    </>
)

}

export default BcaStudents