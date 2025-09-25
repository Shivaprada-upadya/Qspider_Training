import BcaStudents from "./BcaStudents"
const StudentDetails = ()=>{
    let stud = [

        {fname: 'kanna', age: 20,degree:'mca'},
        {fname: 'Shiva', age: 20,degree:'bca'},
        {fname: 'prada', age: 20,degree:'be'},
        {fname: 'upadya', age: 20,degree:'mca'},
        {fname: 'ohooo', age: 20,degree:'mca'}

    ]

    let bcaStud = stud.filter((elem)=>{

        return elem.degree==='mca'

    })

    return(
        <>
        <h1>Student Details</h1>
        <BcaStudents bcaStud={bcaStud}/>
        </>
    )
}

export default StudentDetails