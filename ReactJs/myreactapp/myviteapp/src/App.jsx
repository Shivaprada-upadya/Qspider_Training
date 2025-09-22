//import React, {useState} from 'react'
import "./App.css"
import Navbar from "./components/Navbar"
import Footer from "./components/Footer"
//import React from 'react'

// const App = ()=>
// {
//   let [count, setCount]= useState(0)
//   //let count=0

// let increment = () =>
// {
//   setCount(prevCount=> prevCount + 1 );
// };

//   //let count=0
//   //let name=["Shivaprada ","prada ","shiva"]

//  // return  <h1>{xyz}</h1>
//    return (<button onClick={increment}> count is: {count}</button> )     
// }

const App=()=>{
  return (
    <>
    <Navbar/>
    <h1>I am Component Function</h1>
    <Footer/>
    </>
  )
}

export default App
