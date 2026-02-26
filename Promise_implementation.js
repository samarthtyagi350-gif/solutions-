
const myPromise = new Promise((resolve, reject) => {

    let condition = true;

    setTimeout(() => {
        if (condition) {
            resolve("Success: Promise resolved after 2 seconds!");
        } else {
            reject("Error: Condition failed. Promise rejected.");
        }
    }, 2000);

});



myPromise
    .then((message) => {
        console.log(message);   
    })
    .catch((error) => {
        console.log(error);     
    });
