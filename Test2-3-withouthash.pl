my @chars = ("A".."Z", "a".."z");
my @data;
my $start = time;
for( $a = 0; $a <100; $a = $a + 1 ) {
    my $name;
    my $age; 
    $name .= $chars[rand @chars] for 1..3; 
    $age=int(rand(100)); 
    $duplicate=0; 
    for($i=0;$i<$a;$i++) {
        if($data[$i][0]==$name){ 
            $duplicate=1; 
            break;
        }
    }
    if($duplicate==0) { 
    $data[$a][0] = $name;
    $data[$a][1] = $age; 
    } else { 
    $a=$a-1;
    }
}

my $duration = time - $start;
print "Execution time: $duration s\n";