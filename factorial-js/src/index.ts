export const factorial = (num: number): number => {
    if(num < 0) {
        const errorMessage = "Factorial of negative numbers can not exist.";
        console.error(errorMessage);
        throw new Error(errorMessage);
    }
    else if(num <= 1) {
        return 1;
    } 
    else {
        return num * factorial(num - 1);
    }
}

// const testNumber = 5;
// console.log(`Hello, the factorial of ${testNumber} is ${factorial(testNumber)}`);