let xbonacci (s: int list) (n : int) : int list =
  let fib init =
    Seq.concat [init;
        Seq.unfold (fun state -> 
            let next = state |> Seq.sum
            Some(next, Seq.append (state |> Seq.skip(1)) [next] ) ) init
    ] 
    
  s 
  |> List.toSeq
  |> fib
  |> Seq.take n
  |> Seq.toList

xbonacci [1;1;1] 10

// module Tests = begin
//   open Fuchu
//   let suite =
//       testList "Solution" [
//           testCase "Basic Tests" <|
//             fun _ ->  Assert.Equal("Should make fibonacci sequence, starting at 0",xbonacci [0;1] 10 , [0;1;1;2;3;5;8;13;21;34])
//                       Assert.Equal("Should make fibonacci sequence",xbonacci [1;1] 10 , [1;1;2;3;5;8;13;21;34;55])
//                       Assert.Equal("",xbonacci [0;0;0;0;1] 10 , [0;0;0;0;1;1;2;4;8;16])
//                       Assert.Equal("",xbonacci [1;0;0;0;0;0;1] 10 , [1;0;0;0;0;0;1;2;3;6])
//                       Assert.Equal("",xbonacci [1;2;3;5;7;9;11;13;17;19;23] 20 , [1; 2; 3; 5; 7; 9; 11; 13; 17; 19; 23; 110; 219; 436; 869; 1733; 3459; 6909;
//  13807; 27601])
//       ]
// end