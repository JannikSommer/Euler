num index = 0;
matrix A = {0.95, 0; 0   , 1};
vector x = <12, 0>;
matrix B = <1.1, 5>;
vector u = <1>;

while index < 50 do
    if x[0] < 20 then
        u = <1>;
    else if x[0] > 20 then
        u = <0>;
    end
    x = A*x*(B*u);
    print("temp: " + x[0] + "price: " + x[1]);
end
$