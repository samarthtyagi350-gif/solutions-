// const user={
//     f_name:"samarth",
//     l_name:"tyagi",
//     adress:{city:"ghaziabad",
//         country:"india"
//     }

// };

// let a=user.adress.city
// console.log(a)


//object destructuring

// let{f_name:fn,l_name:ln,adress:{city,country}}=user
// console.log(`coutry and city are: ${city} ${country}`)
// console.log(`first name is: ${fn} and last name is: ${ln}`)


// let num=[1,2,3,4,5,6]
// let[a,b,c,,e]=num
// console.log(e)


// let color=["red","green","blue"]
// let[x,,z]=color
// console.log(z)


// const student={
//     name:"samarth",
//     age:21,
//     marks:{maths:90,science:100}
// }


// function display({name,age,marks}){
//     console.log(`name is ${name} age is ${age} marks in maths is ${marks.maths} and marks in science is ${marks.science}`)
// }

// display(student)



const student={
    id:1,
    name:"samarth",
    courses:{c1:"maths",c2:"science"},
    adress:{city:"ghaziabad",country:"india"},
    marks:[100,90,98],
    admissionstatus:true
}


function display({id,name,courses:{c1,c2},adress:{city,country},marks:[m1,m2,m3]}){
    console.log(`id is ${id} name is ${name} courses are ${c1} and ${c2} city is ${city} country is ${country} marks are ${m1},${m2},${m3}`)

    let avg_marks=m1+m2+m3/3
    console.log(`average marks are : ${avg_marks}`)

    if (avg_marks>80 && admissionstatus==true){
        console.log("Eligible for Merit scholarship")
    }else{
        console.log("Regular admission")
    }
}

display(student)


