def formRectangle(a, b, c, d)
  x1=a[0]
  y1=a[1]
  x2=b[0]
  y2=b[1]
  x3=c[0]
  y3=c[1]
  x4=d[0]
  y4=d[1]
     x2 -= x1; x3 -= x1; x4 -= x1; y2 -= y1; y3 -= y1; y4 -= y1;

        (x2 + x3 == x4 && y2 + y3 == y4 && x2 * x3 == -y2 * y3) ||
        (x2 + x4 == x3 && y2 + y4 == y3 && x2 * x4 == -y2 * y4) ||
        (x3 + x4 == x2 && y3 + y4 == y2 && x3 * x4 == -y3 * y4)

end
