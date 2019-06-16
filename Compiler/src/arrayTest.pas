program arrayTest;
var a1: array[20..40] of integer;
var c1: array['a'..'d'] of integer;

begin
    a1[23] := 3;
    a1[24] := a1[23] + 5;
    writeln(a1[24]);

    c1['b'] := 100;
    writeln(c1['b'])
end.