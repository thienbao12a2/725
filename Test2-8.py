def first():
    a = 10
    
    def second():
        nonlocal a
        b = a
        c = 50
        print('Variable b references a from function first() so b = ',b)
        try:
            print('variable d: ',d)
        except:
            print('accessing the variable d from non-local function... ')
        
        def third():
            nonlocal a
            nonlocal c
            i = a
            j = c
            print('Variable i references a from function first() so i = ',i)
            print('Variable j references c from function second() so j = ',j)
        third()    
    second()
    d = 20
    print(' In the function first(), variable d =',d)
first()