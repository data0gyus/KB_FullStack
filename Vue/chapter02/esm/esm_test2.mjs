
// export default hi;
// -> 가져올 수 있는게 hi밖에 없다! (무조건 hi)
// -> 저장할 변수의 이름을 바꿔도 hi가 대입
import abc from './greeting-2.mjs';
// abc = { hi, goodbye }

abc.hi('훈이');
abc.goodbye('맹구');