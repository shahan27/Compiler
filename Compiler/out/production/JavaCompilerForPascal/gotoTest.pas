program gotoTest;
label label1;
var x: integer;


begin
    x := 3;
    if x = 3 then
        goto label1;

    x := 4;

    label1: writeln(x);

end.