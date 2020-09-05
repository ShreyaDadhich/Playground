def createarray(a,b):
    x=int(input())       
    y=int(input())      
    getelement(x,y,a,b)

def getelement(x,y,a,b):
    for i in range(x*y):
        a.append(int(input()))
    for i in range(x*y):
        b.append(int(input()))
    addmatrix(x,y,a,b)

def addmatrix(x,y,a,b):
    for i in range(x):
        j=i*y
        for k in range(j,y+j):
            print(a[k]+b[k], end=" ")
        print()
a=[]
b=[]
createarray(a,b)