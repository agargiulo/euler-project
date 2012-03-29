problem9 = product (head  [ [a,b,c] | c <- [1..425], b <- [1..c], a <- [1..b], a^2 + b^2 == c^2, a+b+c == 1000, a<b, b<c ])
