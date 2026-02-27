// template literals

// let f_name="samarth"
// let l_name="tyagi"

// console.log(f_name+" "+l_name)

//or

// console.log(`hello my name is ${f_name} ${l_name}`)

// let msg=`my name is samarth tyagi
// i am learning javascript`
// console.log(msg)


// const add=function(a,b){
//     return a+b
// }
// console.log(add(2,3))


// arrow function(arrow function ka khud ka this nahi hota)
// const add=(a,b)=>{
//     return a+b
// }
// console.log(add(2,3))


// template literals 
// let a=10
// let b=20
// console.log(`sum is ${a+b}`)


// `use strict`
// function abc(){
//     a=10
//     console.log(a)
// }
// abc(); //error


// `use strict`
// function abc(){
//     let a=10
//     console.log(a)
// }
// abc();

//explicit return
// let add=(a,b)=>{
//     return a+b
// }


//implicit return
// let add=(a,b)=>a+b


// let name=({n:"samarth"})
// console.log(name.n)

// const obj={
//     name:"samarth",
//     normalfn:function(){
//         console.log(this.name);
//     },arrowfn:()=>{
//         console.log(this.name);
//     }
// };

// obj.normalfn();
// obj.arrowfn();


const obj={
    name:"samarth",
 showname:function(){
    const arrowfn=()=>{
        console.log(this.name);
    }
    arrowfn();
}
};

obj.showname();