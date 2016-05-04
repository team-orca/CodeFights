distance(X1,Y1,X2,Y2,D) :- D is sqrt( (X1-X2) * (X1-X2) + (Y1-Y2) *(Y1-Y2) ).
checkTriangle(X1,Y1,X2,Y2,X3,Y3)
	:- distance(X1,Y1,X2,Y2,Z),
		distance(X1,Y1,X2,Y2,K),
			distance(X1,Y1,X2,Y2,T),
		Z+K > T,
			K+T > Z,
				Z+T > K.
		  
