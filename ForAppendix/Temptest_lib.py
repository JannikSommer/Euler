import numpy as np

def main():
    t_room = 12.
    price = 0.
    A = np.array([[0.95, 0], [0, 1]])
    Xvec = np.array([t_room, price])
    b = np.array([1.1,5])
    u = 1
    print(Xvec)
    print(A)
    print(b)
    print(u)

    for i in range(50):
        print(Xvec)
        
        if Xvec[0] < 20:
            u = 1
        elif Xvec[0] > 20:
            u = 0
        #Bu = [b[0]*u, b[1]*u]
        print(b)
        print(u)
        Bu = b.dot(u)
        print(Bu)
        print(A)
        print(Xvec)
        #Xvec = vectorvector(matirxvectormult(A,Xvec),Bu)
        Ax = A.dot(Xvec)
        print(Ax) 
        Xvec = Ax.dot(Bu)
        print(Xvec)

main()
