program procedureFunctionTest;
var x, y, z: integer;

procedure p;
    begin
        z := x+x;
    end;

begin
    x := 2;
    y := 5;
    p;
    writeln(z);
end.
