boolean formRectangle(int[] A, int[] B, int[] C, int[] D) {
         int x1=A[0],y1=A[1],x2=B[0],y2=B[1],x3=C[0],y3=C[1],x4=D[0],y4=D[1];
     x2 -= x1; x3 -= x1; x4 -= x1; y2 -= y1; y3 -= y1; y4 -= y1;
    return
        (x2 + x3 == x4 && y2 + y3 == y4 && x2 * x3 == -y2 * y3) ||
        (x2 + x4 == x3 && y2 + y4 == y3 && x2 * x4 == -y2 * y4) ||
        (x3 + x4 == x2 && y3 + y4 == y2 && x3 * x4 == -y3 * y4);

}
/*
*translate the quadrilateral so that one of its vertices now lies at the origin
*the three remaining points form three vectors from the origin
*one of them must represent the diagonal
*the other two must represent the sides
*by the parallelogram rule if the sides form the diagonal, we have a parallelogram
*if the sides form a right angle, it is a parallelogram with a right angle
*opposite angles of a parallelogram are equal
*consecutive angles of a parallelogram are supplementary
*therefore all angles are right angles
*it is a rectangle
*it is much more concise in code, though :-)
*/
