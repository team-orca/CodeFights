def maxSubarray(a)
    max, head, tail = 0, 0, 0
    cur_head = 0
    sum = [ [0, a[0]].max ] # base case
    (1...a.size).each do |j|
        sum[j] = [0, sum[j-1] + a[j]].max # bottom-up
        cur_head = j if sum[j-1] == 0 and sum[j] > 0
        if sum[j] > max
            head = cur_head
            tail = j
            max = sum[j]
        end
    end
    return max

end
