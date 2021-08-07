package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func readFromFile() ([]string, bool) {
	var row []string
	rowHandle, err := os.Open("numbers.txt")

	if err != nil {
		return nil, false
	}

	defer rowHandle.Close()
	rowScanner := bufio.NewScanner(rowHandle)

	for rowScanner.Scan() {
		row = append(row, rowScanner.Text())
	}

	return row, true

}


func writeToFile(avg float64, what bool) bool {
	var op string

	if what {
		op = "rowAvg.txt"
	} else {
		op = "totalAvg.txt"
	}
	fileHandle, err := os.OpenFile(op,
		os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0644)

	if err != nil {
		return false
	}

	defer fileHandle.Close()
	_, err = fileHandle.WriteString(fmt.Sprintf("%f\n", avg))

	if err != nil {
		fmt.Printf("Err :%v", err)
	}

	return true

}


func main() {
	lines, result := readFromFile()

	if !result {
		fmt.Println("Err !")
	} else {
		var sum float64 = 0
		var numberCount int
		var total float64

		for i := 0; i < len(lines); i++ {
			text := strings.Split(lines[i], "\t")

			for j := 0; j < len(text)-1; j++ {
				num, err := strconv.ParseFloat(text[j], 64)

				if err != nil {
					fmt.Printf("Err")
				}

				sum += num
				numberCount++

			}

			average := float64(sum) / float64((len(text) - 1))
			fmt.Printf("%d. row average %.2f\n", i+1, average)

			total += sum
			sum = 0

			writeToFile(average, true)

		}

		totalAvg := float64(total) / float64(numberCount)
		fmt.Printf("\nTotal Average %.2f", totalAvg)
		writeToFile(totalAvg, false)

	}

}