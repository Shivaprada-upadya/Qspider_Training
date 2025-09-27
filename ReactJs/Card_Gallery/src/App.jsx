
import Card from "./components/Card"

const App=()=>{
  return (
   
    <>
    <div className="d-flex justify-content-around mb-5">
    <Card name="jeep" source="../public/jeep.jpg"/>
    <Card name="bmw" source="../public/bmw.jpg"/>
    <Card name="jeep" source="../public/jeep.jpg" />
    <Card name="jeep" source="../public/jeep.jpg"/>
    </div>

    <div className="d-flex justify-content-around">
    <Card name="jeep" source="../public/jeep.jpg"/>
    <Card name="bmw" source="../public/bmw.jpg"/>
    <Card name="jeep" source="../public/jeep.jpg" />
    <Card name="jeep" source="../public/jeep.jpg"/>
    </div>


    </>
  )
}

export default App