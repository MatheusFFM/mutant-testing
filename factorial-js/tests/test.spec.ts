import { factorial } from "../src";

describe('factorial()', () => {
    test('should calculate the factorial of a number greater than 1', () => {
        // Arrange
        const testNumber = 5;

        // Act
        const factorialResult = factorial(testNumber);

        // Assert
        expect(factorialResult).toBe(120);
    })

    test('should return 1 with the factorial of 1', () => {
        // Arrange
        const testNumber = 1;

        // Act
        const factorialResult = factorial(testNumber);

        // Assert
        expect(factorialResult).toBe(1);
    })

    test('should return 1 with the factorial of 0', () => {
        // Arrange
        const testNumber = 0;

        // Act
        const factorialResult = factorial(testNumber);

        // Assert
        expect(factorialResult).toBe(1);
    })

    test('should throw a error with a negative number', () => {
        // Arrange
        const testNumber = -1;

        // Act && Assert
        expect(() => {factorial(testNumber)}).toThrow("Factorial of negative numbers can not exist.");
    })
})