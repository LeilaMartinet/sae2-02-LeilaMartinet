def erase(cc):
    pass


def test ():
    if erase ('06   07 65 19 70 ') == '06   07651970' :
        print ('OK test 1')
    if erase ('666, the number of the beast') == '666,thenumberofthebeast' :
        print ('OK test 2')
    if erase (' Cou cou  J M  B') == 'Coucou  JM  B' :
        print ('OK test 3')
    if erase ('') == '' :
        print ('OK test 4')
    if erase (' ') == '' :
        print ('OK test 5')
    if erase ('  ') == '  ' :
        print ('OK test 6')
    if erase ('   ') == '   ' :
        print ('OK test 7')
    if erase ('    ') == '    ' :
        print ('OK test 8')
    if erase ('   f ') == '   f' :
        print ('OK test 9')
    if erase (' a') == 'a' :
        print ('OK test 10')
    if erase ('       ') == '       ' :
        print ('OK test 11')

test ()