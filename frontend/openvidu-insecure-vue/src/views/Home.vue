<template>
  <div style="background-color: white">
    <b-list-group class="scroll" v-b-scrollspy:listgroup-ex>
      <b-img
        src="https://i.imgur.com/r7gPgHQ.png"
        style="width: 200px; height: 200px"
      ></b-img>
      <b-list-group-item href="#list-item-1"
        >프렌젝트 기능소개</b-list-group-item
      >
      <b-list-group-item href="#list-item-2">사용 가이드</b-list-group-item>
      <b-list-group-item href="#list-item-3">개발자 소개</b-list-group-item>
    </b-list-group>

    <Header :is-login="isLogin" @logout="logout" />
    <b-container
      id="listgroup-ex"
      class="box"
      style="overflow: auto; height: 100%; padding-top: 2%"
    >
      <div style="margin: 0 auto">
        <div style="width: 80%; margin: 0 auto">
          <div class="box1"></div>
        </div>
        <div>
          <div id="list-item-1" class="box2">
            <!-- 프로젝트실 -->
            <b-row>
              <b-col
                ><b-img
                  class="before"
                  src="
          https://user-images.githubusercontent.com/16666658/154446018-1bc67ea4-ccd0-4686-9a1a-d49ce328930b.jpeg"
                ></b-img>
                <b-img
                  class="tiger"
                  src="
          https://i.imgur.com/zWsKbOh.png"
                ></b-img>
              </b-col>
              <b-col><div class="after">여기에 프로젝트실</div></b-col>
            </b-row>

            <!-- 회의실 -->
            <b-row style="position: relative; top: -100px">
              <b-col style="margin-top: 20vh"
                ><b-img
                  class="tiger"
                  width="500px"
                  src="
          https://i.imgur.com/nBcD9Om.png"
                ></b-img>

                <!-- https://i.imgur.com/zWsKbOh.png
                    https://i.imgur.com/8opJWLv.png
                    https://i.imgur.com/nBcD9Om.png -->
              </b-col>
              <b-col><div class="after">여기에 회의실</div></b-col>
            </b-row>

            <!-- 열람실 -->
            <b-row style="position: relative; top: -50px">
              <b-col style="margin-top: 20vh"
                ><b-img
                  class="tiger"
                  width="500px"
                  src="
          https://i.imgur.com/8opJWLv.png"
                ></b-img>

                <!-- https://i.imgur.com/vW8AtUd.png
https://i.imgur.com/zXk602T.png
https://i.imgur.com/xezYRPb.png -->
              </b-col>
              <b-col><div class="after">여기에 열람실</div></b-col>
            </b-row>
          </div>
        </div>
        <div class="box3">
          <!-- 그밖의 짱 유용한 기능 -->
          <b-img
            src="
          https://user-images.githubusercontent.com/16666658/154434778-7f568332-58cf-4ee5-9c32-1980e2c95fdb.png"
            style="width: 500px"
          ></b-img>
          <b-row style="position: relative; top: 50px">
            <b-col>
              <p>아이스브레이킹 타임</p>

              <b-img
                class="img"
                src="https://i.imgur.com/WTNqLOC.png"
                style="width: 500px; height: 500px"
              ></b-img>

              <b-img
                class="gif"
                src="https://user-images.githubusercontent.com/16666658/154550253-1c628c0b-d959-447a-82c7-4103fd500363.gif"
              ></b-img>
            </b-col>

            <b-col>
              <p>투표 생성 기능</p>
              <b-img
                class="img"
                src="https://i.imgur.com/hmUi8wk.png"
                style="width: 500px; height: 500px"
              ></b-img>
              <b-img
                class="gif"
                src="https://user-images.githubusercontent.com/16666658/154548119-d34b5993-9bc8-4b37-98b5-26857c0c18be.gif"
              ></b-img>
            </b-col>
          </b-row>

          <b-row style="position: relative; top: -300px">
            <b-col>
              <p>코드 에디터 기능</p>
              <b-img
                class="img"
                src="https://i.imgur.com/mUkw3i3.png"
                style="width: 500px; height: 500px"
              ></b-img>
              <b-img
                class="gif2"
                src="https://user-images.githubusercontent.com/16666658/154573320-a49127ed-04d1-4ab1-93aa-52a41402a4f9.gif"
              ></b-img>
            </b-col>
            <b-col>
              <p>해결의 책</p>
              <b-img
                class="img"
                src="https://i.imgur.com/jW4ODvo.png"
                style="width: 500px; height: 500px"
              ></b-img>
              <b-img
                class="gif"
                src="https://user-images.githubusercontent.com/16666658/154572426-31cec45c-db42-4dd3-b049-ded0bc9e7b01.gif"
              ></b-img>
            </b-col>
          </b-row>
        </div>
        <div class="box4" id="list-item-2">
          <!-- 사용 가이드 -->
          <b-img
            src="
         https://user-images.githubusercontent.com/16666658/154434788-f3492ce4-e7a7-4c45-8953-28fbe9aecce7.png"
            style="width: 500px; margin: 0 auto"
          ></b-img>

          <b-row class="step">
            <b-col>
              <b-img
                src="
         https://i.imgur.com/ZV2NiYr.png"
              ></b-img
            ></b-col>
            <b-col> <p>여기에 카카오 로그인 하는 gif</p></b-col>
          </b-row>
          <b-row class="step">
            <b-col>
              <b-img
                src="
         https://i.imgur.com/wOP7lNy.png"
              ></b-img
            ></b-col>

            <b-col>
              <p>
                새로운 프로젝트 만드려면? 프로젝트를 생성하고 팀원을 초대하세요.
              </p>
              <p>이미 프로젝트가 있다면? 팀 코드를 입력하여 참가하세요.</p>
              <p>이미 참여중인 프로젝트엔 간편하게 접속 할 수 있습니다.</p>
            </b-col>
          </b-row>
          <b-row class="step">
            <b-col>
              <b-img
                src="
         https://i.imgur.com/oR7tPQt.png"
              ></b-img
            ></b-col>
            <b-col
              ><p>
                대면의 장점과 편리함만 쏙 가져온 프렌젝트의 유용한 기능을
                활용해서 개발해보세요!
              </p></b-col
            >
          </b-row>
        </div>
        <div
          class="box5"
          id="list-item-3"
          style="position: relative; margin-top: 50vh"
        >
          <div style="position: relative; right: -480; top: 110">
            <b-img class="img-md" src="https://i.imgur.com/tzLp70W.png"></b-img>
            <b-img class="img-md" src="https://i.imgur.com/2AdLZmE.png"></b-img>
          </div>
          <div>
            <b-container fluid id="profile">
              <b-row>
                <b-col>
                  <b-img
                    thumbnail
                    fluid
                    src="https://i.imgur.com/fxS2dXU.jpg"
                    alt="Image 1"
                    style="height: 240px"
                  ></b-img>
                </b-col>
                <b-col>
                  <b-img
                    thumbnail
                    fluid
                    src="https://i.imgur.com/Qh4FTSf.jpg"
                    alt="Image 2"
                    style="height: 240px"
                  ></b-img>
                </b-col>
                <b-col>
                  <b-img
                    thumbnail
                    fluid
                    src="https://i.imgur.com/sECguMj.jpg"
                    alt="Image 3"
                    style="height: 240px"
                  ></b-img>
                </b-col>
                <b-col>
                  <b-img
                    thumbnail
                    fluid
                    src="https://i.imgur.com/JVL9X2f.jpg"
                    alt="Image 3"
                    style="height: 240px"
                  ></b-img>
                </b-col>
                <b-col>
                  <b-img
                    thumbnail
                    fluid
                    src="https://i.imgur.com/MoOGtnm.jpg"
                    alt="Image 3"
                    style="height: 240px"
                  ></b-img>
                </b-col>
              </b-row>
            </b-container>
            <b-row style="margin: 0 auto; padding-left: 50px">
              <b-col>
                <!-- 김주향 -->

                <b-img
                  class="img-name"
                  src="https://i.imgur.com/I5oSmnl.png"
                ></b-img>
                <p>풀스택</p>
                <p>개발 총괄</p>
                <p></p
              ></b-col>

              <!-- 송진섭 -->
              <b-col
                ><b-img
                  class="img-name"
                  src="https://i.imgur.com/rTXM1eB.png"
                ></b-img>

                <p>풀스택</p>
                <p>문서 담당</p>
              </b-col>
              <!-- 안세연 -->
              <b-col>
                <b-img
                  class="img-name"
                  src="https://i.imgur.com/R7QKCUJ.png"
                ></b-img>
                <p>풀스택</p>
                <p>서버 배포, DB 담당</p>
              </b-col>
              <!-- 이소라 -->
              <b-col
                ><b-img
                  class="img-name"
                  src="https://i.imgur.com/jlAADyB.png"
                ></b-img>
                <p>풀스택</p>
                <p>발표 담당</p>
              </b-col>
              <!-- 정채은 -->
              <b-col
                ><b-img
                  class="img-name"
                  src="https://i.imgur.com/xKNa5GE.png"
                ></b-img>
                <p>풀스택</p>
                <p>서버 배포, JIRA 담당</p>
              </b-col>
            </b-row>
          </div>
        </div>
      </div>
    </b-container>
  </div>
</template>

<script>
import Header from "../components/layout/Header.vue";
export default {
  components: {
    Header,
  },
};
</script>

<style scoped>
@import "../assets/style/macbook.css";
@import "../assets/style/typing.css";

/* https://i.imgur.com/MoOGtnm.jpg
https://i.imgur.com/wAD9JD5.png
https://i.imgur.com/4stHk21.png
https://i.imgur.com/HN34fr6.jpg */

.box1,
.box2,
.box3 {
  background-repeat: no-repeat;
  background-size: cover;
  margin: 0 auto;
}
.box1 {
  position: relative;
  height: 750px;
  background-image: url("https://i.imgur.com/ysqw1NX.png");
  border-radius: 11%;
}

.box2 {
  position: relative;
  top: -150px;
  height: 1800px;
  background-image: url("https://i.imgur.com/Wbj1OOP.png");
}

.img-md {
  width: 300px;
}
.box3 {
  width: 80%;
  position: relative;
  top: -100px;
  height: 1000px;
  text-align: center;
}

.box4 {
  width: 80%;
  height: 500px;
  margin: 0 auto;
  text-align: center;
}

.box5 {
  width: 80%;
  height: 1000px;
  margin: 0 auto;
}

.before {
  position: relative;
  width: 320px;
  height: 320px;
  top: 80vh;
  left: 40vh;
  border-radius: 10%;
}
.after {
  position: relative;
  width: 400px;
  height: 320px;
  background-color: white;
  top: 80vh;
  left: 20vh;
  border-radius: 10%;
}

.scroll {
  width: 150px;
  position: fixed;
  left: 3vh;
  top: 50vh;
}

#profile {
  background-color: #edd0a2;
  padding-top: 80px;
  padding-bottom: 30px;
}

.box::-webkit-scrollbar {
  display: none; /* Chrome, Safari, Opera*/
}

.img-name {
  width: 100px;
}

.img {
  position: relative;
  top: -100px;
}

.step1 {
  position: relative;
  left: 0px;
}

.gif {
  position: relative;
  top: -480px;
  width: 350px;
  height: 250px;
}

.gif2 {
  position: relative;
  top: -480px;
  width: 300px;
  height: 320px;
}

.tiger {
  position: relative;
  top: 65vh;
  left: 30vh;
}
</style>
