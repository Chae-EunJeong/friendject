FROM node:lts-alpine as build-stage
WORKDIR /homepage

COPY . .
RUN npm install
RUN npm run build

FROM nginx:stable-alpine as production-stage

COPY --from=build-stage ./homepage/dist /usr/share/nginx/html/homepage

EXPOSE 3000
CMD ["nginx", "-g", "daemon off;"]
