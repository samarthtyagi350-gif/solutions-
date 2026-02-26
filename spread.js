//spread array

old_array=[1,2,3,4,5,6]

new_array=["samarth","rahul",...old_array,7,8,9]
console.log(new_array)




function add(a,b,c){
    return a+b+c
}

numbers=[1,2,3]
console.log(add(...numbers))



const l1=["A","B","C"]
const l2=["D","E","F"]
const l3=[...l1,...l2]

console.log(l3)


