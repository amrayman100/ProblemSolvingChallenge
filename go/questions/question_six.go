package questions

func Transpose(matrix [][]int) [][]int {
	row := len(matrix)
	column := len(matrix[0])
	transposedMatrix := make([][]int, column)

	for i := range transposedMatrix {
		transposedMatrix[i] = make([]int, row)
	}

	for i := 0; i < row; i++ {
		for j := 0; j < column; j++ {
			transposedMatrix[j][i] = matrix[i][j]
		}
	}
	return transposedMatrix
}
