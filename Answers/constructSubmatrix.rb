def constructSubmatrix(matrix, rowsToDelete, columnsToDelete)
    arr = []
    for x in 0...matrix.size
        if rowsToDelete.count(x) != 0
            next
        end
        arr.push []
        for y in 0...matrix[0].size
            if columnsToDelete.count(y) != 0
                next
            end
            arr[-1].push matrix[x][y]
        end
    end
    arr
end
