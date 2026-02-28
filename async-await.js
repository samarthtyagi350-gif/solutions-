// const promise1=new promise(function(resolve,reject){
//     setTimeout(()=>{
//         let error=true
//         if(error){
//             resolve({username:"kakarott",id:"super saiyan"})
//         }
//     },3000);

// })

// async function consumepromise1(){
//     try{
//         const response=await promise1
//         console.log(response)
//     }
//     catch(error){
//         console.log(error)
//     }
// }


// consumepromise1()


const promise2=new promise(function(resolve,reject){
    setTimeout(()=>{
        console.log("promise2 resolved")
    })
})



