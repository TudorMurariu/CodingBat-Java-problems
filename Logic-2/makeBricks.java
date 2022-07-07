// not much to say abt this one

public boolean makeBricks(int small, int big, int goal) {
  int mari = goal/5;
  if(mari > big)
    goal -= big*5;
  else
    {
      goal -= mari*5;
      return goal <= small;
    }
  return goal <= small;
}
