const express = require("express");
const bodyParser = require("body-parser");
const app = express();

app.use(bodyParser.urlencoded())

// parse application/json
app.use(bodyParser.json())

const port = 4040;

let list = [
    {
        id: 1,
        name: "Daniel",
        age: "3",
        grades: "1"
    }
];

app.get("/people", (req,res)=>{
    res.send(list);
});

app.get("/people/:id", (req,res)=>{
    for (let index = 0; index < list.length; index++) {
        const element = list[index];
        if(req.params.id == element.id){
            res.send(element);
        }
    }
    res.send("people not found");
});

app.post("/people", (req,res)=>{
    console.log(req.body);
    
    list.push(req.body);
    res.send(req.bod);


});

app.listen(port, ()=>{
    console.log("Server is running on Port: " + port);
    
})