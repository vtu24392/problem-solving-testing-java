/*===================================================================================================================== 
  LEETCODE
  1603. Design Parking System 

  Example 1:
  Input
  ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
  [[1, 1, 0], [1], [2], [3], [1]]
  Output
  [null, true, true, false, false]
  
  Explanation
  ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
  parkingSystem.addCar(1); // return true because there is 1 available slot for a big car
  parkingSystem.addCar(2); // return true because there is 1 available slot for a medium car
  parkingSystem.addCar(3); // return false because there is no available slot for a small car
  parkingSystem.addCar(1); // return false because there is no available slot for a big car. It is already occupied.

=======================================================================================================================*/

class ParkingSystem {

    int[] empty;

    public ParkingSystem(int big, int medium, int small) {
        this.empty = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if(this.empty[carType - 1] > 0) {
            this.empty[carType - 1]--;
            return true;
        }
        return false;
    }
}
