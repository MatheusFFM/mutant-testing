import { mean } from "../src";

describe('mean()', () => {
    test('should calculate the mean of 4 and 0', () => {
        // Arrange
        const testNumber1 = 4;
        const testNumber2 = 0;

        // Act3
        const meanResult = mean(testNumber1, testNumber2);

        // Assert
        expect(meanResult).toBe(2);
    })

    test('should calculate the mean of 2 and 4', () => {
        // Arrange
        const testNumber1 = 2;
        const testNumber2 = 4;

        // Act
        const meanResult = mean(testNumber1, testNumber2);

        // Assert
        expect(meanResult).toBe(3);
    })
})